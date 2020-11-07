package com.alia.projectmanagement.util;

/**
 * Created by Ali on Kas,2020
 */
public final class ApiPaths {

    private static final String BASE_PATH = "/api";

    public static final class ProjectCtrl {
        public static final String CTRL = BASE_PATH + "/projects";
    }

    public static final class IssueCtrl {
        public static final String CTRL = BASE_PATH + "/issues";
    }

    public static final class UserCtrl {
        public static final String CTRL = BASE_PATH + "/users";
    }

}