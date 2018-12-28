package org.bonn.se.ws18.midterm.dtos;

import org.bonn.se.ws18.midterm.model.UserStory;

public class UserStoryDTO implements Comparable<UserStoryDTO> {

    private String titel;
    private double prio;
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public double getPrio() {
        return prio;
    }
    public void setPrio(double prio) {
        this.prio = prio;
    }

    /*
     * Methode zum Vergleich zweier UserStories.
     * Vergleich ist implementiert auf Basis des Vergleichs
     * von zwei Prio-Werten.
     */
    public int compareTo(UserStoryDTO input) {
        if ( input.getPrio() == this.getPrio() ) {
            return 0;
        }

        if ( input.getPrio() > this.getPrio() ) {
            return 1;
        }
        else return -1;
    }

}