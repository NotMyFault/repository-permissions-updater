package io.jenkins.infra.repository_permissions_updater;

import java.util.Set;
import java.util.TreeSet;

public class KnownUsers {
    public static boolean existsInArtifactory(String username) {
        return knownArtifactoryUsers.contains(username);
    }

    public static boolean existsInJira(String username) {
        return knownJiraUsers.contains(username);
    }

    /**
     * URL to JSON with a list of valid Artifactory user names.
     */
    private static final String ARTIFACTORY_USER_NAMES_URL = System.getProperty("artifactoryUserNamesJsonListUrl", "https://reports.jenkins.io/artifactory-ldap-users-report.json");
    private static Set<String> knownArtifactoryUsers = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    /**
     * URL to JSON with a list of valid Jira user names.
     */
    private static final String JIRA_USER_NAMES_URL = System.getProperty("jiraUserNamesJsonListUrl", "https://reports.jenkins.io/jira-users-report.json");
    private static Set<String> knownJiraUsers = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
}
