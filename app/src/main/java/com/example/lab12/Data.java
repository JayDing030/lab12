package com.example.lab12;

import javax.xml.transform.Result;

public class Data {
    Result result;

    static class Result{
        Results[] results;

        static class Results{
            String Station;
            String Destination;
        }
    }
}
