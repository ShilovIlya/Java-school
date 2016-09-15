package ru.sberbank.school.SecondHW;

/**
 * Created by Wais on 13.09.2016.
 */

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method give sex in string
     *
     * @return - "man" if person is man, "woman" otherwise
     */
    public String sex() {
        if (man) {
            return "man";
        } else {
            return "woman";
        }
    }

    /**
     * This method checks spouse and generate sstatus string with males and names
     *
     * @return - return "man/woman <name> married to woman/man <name>" if person has wife or husband
     */
    public String status() {
        if (spouse != null) {
            return (sex() + " " + name + " married to " + spouse.sex() + " " + spouse.name);
        } else {
            return (sex() + " " + name + " not marry");
        }
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife.
     * Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     *
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */
    public boolean marry(Person person) {
        if (this.man == person.man) {
            return false;
        }
        if (this.spouse != null) {
            if (!spouse.divorce()){
                return false;
            }
            if (!this.divorce()) {
                return false;
            }
        }
        if (person.spouse != null) {
            if (!person.spouse.divorce()){
                return false;
            }
            if (!person.divorce()) {
                return false;
            }
        }
        this.spouse = person;
        person.spouse = this;
        return true;
    }

    /**
     * Sets spouse = null if spouse is not null
     *
     * @return true - if person status has been changed
     */
    public boolean divorce() {
        if (this.spouse != null) {
            this.spouse = null;
            return true;
        }
        return false;
    }
}
