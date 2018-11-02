package com.simtop.fragments;

public interface Passable {

    /**
     * Pass Data from fragment to activity
     * @param username pass from SectionA to SectionB
     * @param password pass from SectionA to SectionB
     */
    void newCredentials (String username, String password);
}
