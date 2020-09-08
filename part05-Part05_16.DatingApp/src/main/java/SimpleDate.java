
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day++;

        if (this.day == 31) {
            this.day = 1;

            this.month++;
            if (this.month == 13) {
                this.month = 1;

                this.year++;
            }
        }
    }

    public void advance(int howManyDays) {
        this.day += howManyDays;

        if (this.day > 30) {
            this.day = this.day - 30;

            this.month++;
            if (this.month == 13) {
                this.month = 1;

                this.year++;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        int newDays = this.day + days;
        int newMonth = this.month;
        int newYear = this.year;

        if (newDays > 30) {
            newDays = newDays - 30;
            newMonth++;

            if (newMonth > 12) {
                newMonth = 1;
                newYear++;
            }
        }

        SimpleDate newDate = new SimpleDate(newDays, newMonth, newYear);
        return newDate;
    }
}
