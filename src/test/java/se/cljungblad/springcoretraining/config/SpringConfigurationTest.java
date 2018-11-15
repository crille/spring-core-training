package se.cljungblad.springcoretraining.config;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={SpringConfiguration.class})
public class SpringConfigurationTest {

   @Value("${db.username}")
   private String dbUsername;

   @Value("${app.integer.property}")
   private int myNumber;

   @Value("${app.boolean.property}")
   private boolean myBoolean;

    @Value("${app.collection.strings.property}")
    private String[] myStringList;

    //Configured DefaultFormattingConversionService will be used to convert string to float here
    @Value("${app.collection.floats.property}")
    private float[] myFloatNumbers;

    //Configured DefaultFormattingConversionService will be used to convert string to float LocalDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Value("${app.collection.dates.property}")
    private List<LocalDate> myDates;

    //Note that we need to use SpEL #{} to tell spring to convert this to a map
    @Value("#{${app.collection.map.string.to.integer}}")
    private Map<String, Integer> stringToIntegerMap;



    @Test
    public void shouldGetDbUsernameFromPropertySource() {
        assertThat(dbUsername, is("production_user_name"));
    }

    @Test
    public void shouldGetIntegerFromPropertySource() {
        assertThat(myNumber, is(3));
    }

    @Test
    public void shouldGetBooleanFromPropertySource() {
        assertThat(myBoolean, is(false)) ;
    }

    @Test
    public void shouldGetListOfStringFromPropertySource() {
        assertThat(Arrays.asList(myStringList), containsInAnyOrder("one", "two", "three"));
    }

    @Test
    public void shouldGetListOfFloatsFromPropertySourceOkay() {
        assertThat(Arrays.asList(myFloatNumbers), containsInAnyOrder(new float[]{1.2F, 3.4F, 5.6F }));
    }

    @Test
    public void shouldGetListOfDatesFromPropertySourceOkay() {
        assertThat(myDates, containsInAnyOrder(
                parse("2018-09-30T10:00:00", ISO_DATE_TIME),
                        parse("2018-09-29T11:00:00", ISO_DATE_TIME),
                        parse("2018-09-28T12:00:00", ISO_DATE_TIME)));
    }

    @Test
    public void shouldGetMapFromPropertySourceOkay() {
        assertThat(stringToIntegerMap, IsMapContaining.hasEntry("one", 1));
    }

}