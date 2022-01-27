import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * LocalDate is used nowadays to store date
 * LocalTime is used nowadays to store time
 * LocalDateTime is used nowadays to store date & time
 */

public class s20220127 {
    public static void main(String... Args) {
        /**
         * Date can not be created
         * It is just taken
         * Hence it has no constructor
         *
         * It is NOT "mutable"
         */
        LocalDate d = LocalDate.now();
        System.out.println(d);

        /**
         * EPOCH is 1970-01-01
         */
        d = LocalDate.EPOCH;
        System.out.println(d);

        /**
         * Gets current date of that TimeZone
         */
        d = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println(d);

        /**
         * Returns the date as entered
         */
        d = LocalDate.of(2020, 12, 26);
        System.out.println(d);

        /**
         * Takes constant from "month" CLASS
         */
        d = LocalDate.of(2021, Month.JUNE, 1);
        System.out.println(d);

        /**
         * Converts a String to LocalDate
         */
        d = LocalDate.parse("2022-01-12");
        System.out.println(d);

        /**
         * ofEpochDay(L) returns the date after L days from EPOCH date
         */
        d = LocalDate.ofEpochDay(1000);
        System.out.println(d);

        /**
         * minusDays(D) returns the date before D "days" from the date stored in instance
         * On the other hand, plusDays(D) adds them
         */
        System.out.println(d.minusDays(10));

        /**
         * minusMonth(M) returns the date before M "months" from the date stored in instance
         * On the other hand, plusMonths(M) adds them
         */
        System.out.println(d.minusMonths(40));

        /**
         * minusYears(Y) returns the date before Y "years" from the date stored in instance
         * On the other hand, plusYears(y) adds them
         */
        System.out.println(d.minusYears(6));

        /**
         * minusWeeks(W) returns the date before W "weeks" from the date stored in instance
         * On the other hand, plusWeeks(W) adds them
         */
        System.out.println(d.minusWeeks(100));

        /**
         * returns the LocalDate with "day of month" ALTERED
         */
        System.out.println(d.withDayOfMonth(19));

        /**
         * returns the LocalDate with "month" ALTERED
         */
        System.out.println(d.withMonth(6));

        /**
         * returns the LocalDate with "year" ALTERED
         */
        System.out.println(d.withYear(2020));

        /**
         * returns the LocalDate with "day of year" ALTERED
         */
        System.out.println(d.withDayOfYear(189));

        /**
         * returns the LocalDateTime with "HH:mm:ss.SSSSSSSSS" ADDED
         *                      ----
         */
        System.out.println(d.atTime(0,20,0,1719));


        /**
         * static LocalDate	MAX
         * The maximum supported LocalDate, '+999999999-12-31'.
         * static LocalDate	MIN
         * The minimum supported LocalDate, '-999999999-01-01'.
         *
         * Temporal	adjustInto(Temporal temporal)
         * Adjusts the specified temporal object to have the same date as this object.
         * LocalDateTime	atStartOfDay()
         * Combines this date with the time of midnight to create a LocalDateTime at the start of this date.
         * ZonedDateTime	atStartOfDay(ZoneId zone)
         * Returns a zoned date-time from this date at the earliest valid time according to the rules in the time-zone.
         * LocalDateTime	atTime(int hour, int minute)
         * Combines this date with a time to create a LocalDateTime.
         * LocalDateTime	atTime(int hour, int minute, int second)
         * Combines this date with a time to create a LocalDateTime.
         * LocalDateTime	atTime(int hour, int minute, int second, int nanoOfSecond)
         * Combines this date with a time to create a LocalDateTime.
         * LocalDateTime	atTime(LocalTime time)
         * Combines this date with a time to create a LocalDateTime.
         * OffsetDateTime	atTime(OffsetTime time)
         * Combines this date with an offset time to create an OffsetDateTime.
         * int	compareTo(ChronoLocalDate other)
         * Compares this date to another date.
         * boolean	equals(Object obj)
         * Checks if this date is equal to another date.
         * String	format(DateTimeFormatter formatter)
         * Formats this date using the specified formatter.
         * static LocalDate	from(TemporalAccessor temporal)
         * Obtains an instance of LocalDate from a temporal object.
         * int	get(TemporalField field)
         * Gets the value of the specified field from this date as an int.
         * IsoChronology	getChronology()
         * Gets the chronology of this date, which is the ISO calendar system.
         * int	getDayOfMonth()
         * Gets the day-of-month field.
         * DayOfWeek	getDayOfWeek()
         * Gets the day-of-week field, which is an enum DayOfWeek.
         * int	getDayOfYear()
         * Gets the day-of-year field.
         * Era	getEra()
         * Gets the era applicable at this date.
         * long	getLong(TemporalField field)
         * Gets the value of the specified field from this date as a long.
         * Month	getMonth()
         * Gets the month-of-year field using the Month enum.
         * int	getMonthValue()
         * Gets the month-of-year field from 1 to 12.
         * int	getYear()
         * Gets the year field.
         * int	hashCode()
         * A hash code for this date.
         * boolean	isAfter(ChronoLocalDate other)
         * Checks if this date is after the specified date.
         * boolean	isBefore(ChronoLocalDate other)
         * Checks if this date is before the specified date.
         * boolean	isEqual(ChronoLocalDate other)
         * Checks if this date is equal to the specified date.
         * boolean	isLeapYear()
         * Checks if the year is a leap year, according to the ISO proleptic calendar system rules.
         * boolean	isSupported(TemporalField field)
         * Checks if the specified field is supported.
         * boolean	isSupported(TemporalUnit unit)
         * Checks if the specified unit is supported.
         * int	lengthOfMonth()
         * Returns the length of the month represented by this date.
         * int	lengthOfYear()
         * Returns the length of the year represented by this date.
         * LocalDate	minus(long amountToSubtract, TemporalUnit unit)
         * Returns a copy of this date with the specified amount subtracted.
         * LocalDate	minus(TemporalAmount amountToSubtract)
         * Returns a copy of this date with the specified amount subtracted.
         * LocalDate	minusDays(long daysToSubtract)
         * Returns a copy of this LocalDate with the specified number of days subtracted.
         * LocalDate	minusMonths(long monthsToSubtract)
         * Returns a copy of this LocalDate with the specified number of months subtracted.
         * LocalDate	minusWeeks(long weeksToSubtract)
         * Returns a copy of this LocalDate with the specified number of weeks subtracted.
         * LocalDate	minusYears(long yearsToSubtract)
         * Returns a copy of this LocalDate with the specified number of years subtracted.
         * static LocalDate	now()
         * Obtains the current date from the system clock in the default time-zone.
         * static LocalDate	now(Clock clock)
         * Obtains the current date from the specified clock.
         * static LocalDate	now(ZoneId zone)
         * Obtains the current date from the system clock in the specified time-zone.
         * static LocalDate	of(int year, int month, int dayOfMonth)
         * Obtains an instance of LocalDate from a year, month and day.
         * static LocalDate	of(int year, Month month, int dayOfMonth)
         * Obtains an instance of LocalDate from a year, month and day.
         * static LocalDate	ofEpochDay(long epochDay)
         * Obtains an instance of LocalDate from the epoch day count.
         * static LocalDate	ofYearDay(int year, int dayOfYear)
         * Obtains an instance of LocalDate from a year and day-of-year.
         * static LocalDate	parse(CharSequence text)
         * Obtains an instance of LocalDate from a text string such as 2007-12-03.
         * static LocalDate	parse(CharSequence text, DateTimeFormatter formatter)
         * Obtains an instance of LocalDate from a text string using a specific formatter.
         * LocalDate	plus(long amountToAdd, TemporalUnit unit)
         * Returns a copy of this date with the specified amount added.
         * LocalDate	plus(TemporalAmount amountToAdd)
         * Returns a copy of this date with the specified amount added.
         * LocalDate	plusDays(long daysToAdd)
         * Returns a copy of this LocalDate with the specified number of days added.
         * LocalDate	plusMonths(long monthsToAdd)
         * Returns a copy of this LocalDate with the specified number of months added.
         * LocalDate	plusWeeks(long weeksToAdd)
         * Returns a copy of this LocalDate with the specified number of weeks added.
         * LocalDate	plusYears(long yearsToAdd)
         * Returns a copy of this LocalDate with the specified number of years added.
         * <R> R	query(TemporalQuery<R> query)
         * Queries this date using the specified query.
         * ValueRange	range(TemporalField field)
         * Gets the range of valid values for the specified field.
         * long	toEpochDay()
         * Converts this date to the Epoch Day.
         * String	toString()
         * Outputs this date as a String, such as 2007-12-03.
         * Period	until(ChronoLocalDate endDateExclusive)
         * Calculates the period between this date and another date as a Period.
         * long	until(Temporal endExclusive, TemporalUnit unit)
         * Calculates the amount of time until another date in terms of the specified unit.
         * LocalDate	with(TemporalAdjuster adjuster)
         * Returns an adjusted copy of this date.
         * LocalDate	with(TemporalField field, long newValue)
         * Returns a copy of this date with the specified field set to a new value.
         * LocalDate	withDayOfMonth(int dayOfMonth)
         * Returns a copy of this LocalDate with the day-of-month altered.
         * LocalDate	withDayOfYear(int dayOfYear)
         * Returns a copy of this LocalDate with the day-of-year altered.
         * LocalDate	withMonth(int month)
         * Returns a copy of this LocalDate with the month-of-year altered.
         * LocalDate	withYear(int year)
         * Returns a copy of this LocalDate with the year altered.
         */

        /**
         * static LocalTime	MAX
         * The maximum supported LocalTime, '23:59:59.999999999'.
         * static LocalTime	MIDNIGHT
         * The time of midnight at the start of the day, '00:00'.
         * static LocalTime	MIN
         * The minimum supported LocalTime, '00:00'.
         * static LocalTime	NOON
         * The time of noon in the middle of the day, '12:00'.
         *
         * Temporal	adjustInto(Temporal temporal)
         * Adjusts the specified temporal object to have the same time as this object.
         * LocalDateTime	atDate(LocalDate date)
         * Combines this time with a date to create a LocalDateTime.
         * OffsetTime	atOffset(ZoneOffset offset)
         * Combines this time with an offset to create an OffsetTime.
         * int	compareTo(LocalTime other)
         * Compares this time to another time.
         * boolean	equals(Object obj)
         * Checks if this time is equal to another time.
         * String	format(DateTimeFormatter formatter)
         * Formats this time using the specified formatter.
         * static LocalTime	from(TemporalAccessor temporal)
         * Obtains an instance of LocalTime from a temporal object.
         * int	get(TemporalField field)
         * Gets the value of the specified field from this time as an int.
         * int	getHour()
         * Gets the hour-of-day field.
         * long	getLong(TemporalField field)
         * Gets the value of the specified field from this time as a long.
         * int	getMinute()
         * Gets the minute-of-hour field.
         * int	getNano()
         * Gets the nano-of-second field.
         * int	getSecond()
         * Gets the second-of-minute field.
         * int	hashCode()
         * A hash code for this time.
         * boolean	isAfter(LocalTime other)
         * Checks if this time is after the specified time.
         * boolean	isBefore(LocalTime other)
         * Checks if this time is before the specified time.
         * boolean	isSupported(TemporalField field)
         * Checks if the specified field is supported.
         * boolean	isSupported(TemporalUnit unit)
         * Checks if the specified unit is supported.
         * LocalTime	minus(long amountToSubtract, TemporalUnit unit)
         * Returns a copy of this time with the specified amount subtracted.
         * LocalTime	minus(TemporalAmount amountToSubtract)
         * Returns a copy of this time with the specified amount subtracted.
         * LocalTime	minusHours(long hoursToSubtract)
         * Returns a copy of this LocalTime with the specified number of hours subtracted.
         * LocalTime	minusMinutes(long minutesToSubtract)
         * Returns a copy of this LocalTime with the specified number of minutes subtracted.
         * LocalTime	minusNanos(long nanosToSubtract)
         * Returns a copy of this LocalTime with the specified number of nanoseconds subtracted.
         * LocalTime	minusSeconds(long secondsToSubtract)
         * Returns a copy of this LocalTime with the specified number of seconds subtracted.
         * static LocalTime	now()
         * Obtains the current time from the system clock in the default time-zone.
         * static LocalTime	now(Clock clock)
         * Obtains the current time from the specified clock.
         * static LocalTime	now(ZoneId zone)
         * Obtains the current time from the system clock in the specified time-zone.
         * static LocalTime	of(int hour, int minute)
         * Obtains an instance of LocalTime from an hour and minute.
         * static LocalTime	of(int hour, int minute, int second)
         * Obtains an instance of LocalTime from an hour, minute and second.
         * static LocalTime	of(int hour, int minute, int second, int nanoOfSecond)
         * Obtains an instance of LocalTime from an hour, minute, second and nanosecond.
         * static LocalTime	ofNanoOfDay(long nanoOfDay)
         * Obtains an instance of LocalTime from a nanos-of-day value.
         * static LocalTime	ofSecondOfDay(long secondOfDay)
         * Obtains an instance of LocalTime from a second-of-day value.
         * static LocalTime	parse(CharSequence text)
         * Obtains an instance of LocalTime from a text string such as 10:15.
         * static LocalTime	parse(CharSequence text, DateTimeFormatter formatter)
         * Obtains an instance of LocalTime from a text string using a specific formatter.
         * LocalTime	plus(long amountToAdd, TemporalUnit unit)
         * Returns a copy of this time with the specified amount added.
         * LocalTime	plus(TemporalAmount amountToAdd)
         * Returns a copy of this time with the specified amount added.
         * LocalTime	plusHours(long hoursToAdd)
         * Returns a copy of this LocalTime with the specified number of hours added.
         * LocalTime	plusMinutes(long minutesToAdd)
         * Returns a copy of this LocalTime with the specified number of minutes added.
         * LocalTime	plusNanos(long nanosToAdd)
         * Returns a copy of this LocalTime with the specified number of nanoseconds added.
         * LocalTime	plusSeconds(long secondstoAdd)
         * Returns a copy of this LocalTime with the specified number of seconds added.
         * <R> R	query(TemporalQuery<R> query)
         * Queries this time using the specified query.
         * ValueRange	range(TemporalField field)
         * Gets the range of valid values for the specified field.
         * long	toNanoOfDay()
         * Extracts the time as nanos of day, from 0 to 24 * 60 * 60 * 1,000,000,000 - 1.
         * int	toSecondOfDay()
         * Extracts the time as seconds of day, from 0 to 24 * 60 * 60 - 1.
         * String	toString()
         * Outputs this time as a String, such as 10:15.
         * LocalTime	truncatedTo(TemporalUnit unit)
         * Returns a copy of this LocalTime with the time truncated.
         * long	until(Temporal endExclusive, TemporalUnit unit)
         * Calculates the amount of time until another time in terms of the specified unit.
         * LocalTime	with(TemporalAdjuster adjuster)
         * Returns an adjusted copy of this time.
         * LocalTime	with(TemporalField field, long newValue)
         * Returns a copy of this time with the specified field set to a new value.
         * LocalTime	withHour(int hour)
         * Returns a copy of this LocalTime with the hour-of-day altered.
         * LocalTime	withMinute(int minute)
         * Returns a copy of this LocalTime with the minute-of-hour altered.
         * LocalTime	withNano(int nanoOfSecond)
         * Returns a copy of this LocalTime with the nano-of-second altered.
         * LocalTime	withSecond(int second)
         * Returns a copy of this LocalTime with the second-of-minute altered.
         */

        /**
         * static LocalDateTime	MAX
         * The maximum supported LocalDateTime, '+999999999-12-31T23:59:59.999999999'.
         * static LocalDateTime	MIN
         * The minimum supported LocalDateTime, '-999999999-01-01T00:00:00'.
         *
         * Temporal	adjustInto(Temporal temporal)
         * Adjusts the specified temporal object to have the same date and time as this object.
         * OffsetDateTime	atOffset(ZoneOffset offset)
         * Combines this date-time with an offset to create an OffsetDateTime.
         * ZonedDateTime	atZone(ZoneId zone)
         * Combines this date-time with a time-zone to create a ZonedDateTime.
         * int	compareTo(ChronoLocalDateTime<?> other)
         * Compares this date-time to another date-time.
         * boolean	equals(Object obj)
         * Checks if this date-time is equal to another date-time.
         * String	format(DateTimeFormatter formatter)
         * Formats this date-time using the specified formatter.
         * static LocalDateTime	from(TemporalAccessor temporal)
         * Obtains an instance of LocalDateTime from a temporal object.
         * int	get(TemporalField field)
         * Gets the value of the specified field from this date-time as an int.
         * int	getDayOfMonth()
         * Gets the day-of-month field.
         * DayOfWeek	getDayOfWeek()
         * Gets the day-of-week field, which is an enum DayOfWeek.
         * int	getDayOfYear()
         * Gets the day-of-year field.
         * int	getHour()
         * Gets the hour-of-day field.
         * long	getLong(TemporalField field)
         * Gets the value of the specified field from this date-time as a long.
         * int	getMinute()
         * Gets the minute-of-hour field.
         * Month	getMonth()
         * Gets the month-of-year field using the Month enum.
         * int	getMonthValue()
         * Gets the month-of-year field from 1 to 12.
         * int	getNano()
         * Gets the nano-of-second field.
         * int	getSecond()
         * Gets the second-of-minute field.
         * int	getYear()
         * Gets the year field.
         * int	hashCode()
         * A hash code for this date-time.
         * boolean	isAfter(ChronoLocalDateTime<?> other)
         * Checks if this date-time is after the specified date-time.
         * boolean	isBefore(ChronoLocalDateTime<?> other)
         * Checks if this date-time is before the specified date-time.
         * boolean	isEqual(ChronoLocalDateTime<?> other)
         * Checks if this date-time is equal to the specified date-time.
         * boolean	isSupported(TemporalField field)
         * Checks if the specified field is supported.
         * boolean	isSupported(TemporalUnit unit)
         * Checks if the specified unit is supported.
         * LocalDateTime	minus(long amountToSubtract, TemporalUnit unit)
         * Returns a copy of this date-time with the specified amount subtracted.
         * LocalDateTime	minus(TemporalAmount amountToSubtract)
         * Returns a copy of this date-time with the specified amount subtracted.
         * LocalDateTime	minusDays(long days)
         * Returns a copy of this LocalDateTime with the specified number of days subtracted.
         * LocalDateTime	minusHours(long hours)
         * Returns a copy of this LocalDateTime with the specified number of hours subtracted.
         * LocalDateTime	minusMinutes(long minutes)
         * Returns a copy of this LocalDateTime with the specified number of minutes subtracted.
         * LocalDateTime	minusMonths(long months)
         * Returns a copy of this LocalDateTime with the specified number of months subtracted.
         * LocalDateTime	minusNanos(long nanos)
         * Returns a copy of this LocalDateTime with the specified number of nanoseconds subtracted.
         * LocalDateTime	minusSeconds(long seconds)
         * Returns a copy of this LocalDateTime with the specified number of seconds subtracted.
         * LocalDateTime	minusWeeks(long weeks)
         * Returns a copy of this LocalDateTime with the specified number of weeks subtracted.
         * LocalDateTime	minusYears(long years)
         * Returns a copy of this LocalDateTime with the specified number of years subtracted.
         * static LocalDateTime	now()
         * Obtains the current date-time from the system clock in the default time-zone.
         * static LocalDateTime	now(Clock clock)
         * Obtains the current date-time from the specified clock.
         * static LocalDateTime	now(ZoneId zone)
         * Obtains the current date-time from the system clock in the specified time-zone.
         * static LocalDateTime	of(int year, int month, int dayOfMonth, int hour, int minute)
         * Obtains an instance of LocalDateTime from year, month, day, hour and minute, setting the second and nanosecond to zero.
         * static LocalDateTime	of(int year, int month, int dayOfMonth, int hour, int minute, int second)
         * Obtains an instance of LocalDateTime from year, month, day, hour, minute and second, setting the nanosecond to zero.
         * static LocalDateTime	of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
         * Obtains an instance of LocalDateTime from year, month, day, hour, minute, second and nanosecond.
         * static LocalDateTime	of(int year, Month month, int dayOfMonth, int hour, int minute)
         * Obtains an instance of LocalDateTime from year, month, day, hour and minute, setting the second and nanosecond to zero.
         * static LocalDateTime	of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
         * Obtains an instance of LocalDateTime from year, month, day, hour, minute and second, setting the nanosecond to zero.
         * static LocalDateTime	of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
         * Obtains an instance of LocalDateTime from year, month, day, hour, minute, second and nanosecond.
         * static LocalDateTime	of(LocalDate date, LocalTime time)
         * Obtains an instance of LocalDateTime from a date and time.
         * static LocalDateTime	ofEpochSecond(long epochSecond, int nanoOfSecond, ZoneOffset offset)
         * Obtains an instance of LocalDateTime using seconds from the epoch of 1970-01-01T00:00:00Z.
         * static LocalDateTime	ofInstant(Instant instant, ZoneId zone)
         * Obtains an instance of LocalDateTime from an Instant and zone ID.
         * static LocalDateTime	parse(CharSequence text)
         * Obtains an instance of LocalDateTime from a text string such as 2007-12-03T10:15:30.
         * static LocalDateTime	parse(CharSequence text, DateTimeFormatter formatter)
         * Obtains an instance of LocalDateTime from a text string using a specific formatter.
         * LocalDateTime	plus(long amountToAdd, TemporalUnit unit)
         * Returns a copy of this date-time with the specified amount added.
         * LocalDateTime	plus(TemporalAmount amountToAdd)
         * Returns a copy of this date-time with the specified amount added.
         * LocalDateTime	plusDays(long days)
         * Returns a copy of this LocalDateTime with the specified number of days added.
         * LocalDateTime	plusHours(long hours)
         * Returns a copy of this LocalDateTime with the specified number of hours added.
         * LocalDateTime	plusMinutes(long minutes)
         * Returns a copy of this LocalDateTime with the specified number of minutes added.
         * LocalDateTime	plusMonths(long months)
         * Returns a copy of this LocalDateTime with the specified number of months added.
         * LocalDateTime	plusNanos(long nanos)
         * Returns a copy of this LocalDateTime with the specified number of nanoseconds added.
         * LocalDateTime	plusSeconds(long seconds)
         * Returns a copy of this LocalDateTime with the specified number of seconds added.
         * LocalDateTime	plusWeeks(long weeks)
         * Returns a copy of this LocalDateTime with the specified number of weeks added.
         * LocalDateTime	plusYears(long years)
         * Returns a copy of this LocalDateTime with the specified number of years added.
         * <R> R	query(TemporalQuery<R> query)
         * Queries this date-time using the specified query.
         * ValueRange	range(TemporalField field)
         * Gets the range of valid values for the specified field.
         * LocalDate	toLocalDate()
         * Gets the LocalDate part of this date-time.
         * LocalTime	toLocalTime()
         * Gets the LocalTime part of this date-time.
         * String	toString()
         * Outputs this date-time as a String, such as 2007-12-03T10:15:30.
         * LocalDateTime	truncatedTo(TemporalUnit unit)
         * Returns a copy of this LocalDateTime with the time truncated.
         * long	until(Temporal endExclusive, TemporalUnit unit)
         * Calculates the amount of time until another date-time in terms of the specified unit.
         * LocalDateTime	with(TemporalAdjuster adjuster)
         * Returns an adjusted copy of this date-time.
         * LocalDateTime	with(TemporalField field, long newValue)
         * Returns a copy of this date-time with the specified field set to a new value.
         * LocalDateTime	withDayOfMonth(int dayOfMonth)
         * Returns a copy of this LocalDateTime with the day-of-month altered.
         * LocalDateTime	withDayOfYear(int dayOfYear)
         * Returns a copy of this LocalDateTime with the day-of-year altered.
         * LocalDateTime	withHour(int hour)
         * Returns a copy of this LocalDateTime with the hour-of-day altered.
         * LocalDateTime	withMinute(int minute)
         * Returns a copy of this LocalDateTime with the minute-of-hour altered.
         * LocalDateTime	withMonth(int month)
         * Returns a copy of this LocalDateTime with the month-of-year altered.
         * LocalDateTime	withNano(int nanoOfSecond)
         * Returns a copy of this LocalDateTime with the nano-of-second altered.
         * LocalDateTime	withSecond(int second)
         * Returns a copy of this LocalDateTime with the second-of-minute altered.
         * LocalDateTime	withYear(int year)
         * Returns a copy of this LocalDateTime with the year altered.
         */
    }
}
