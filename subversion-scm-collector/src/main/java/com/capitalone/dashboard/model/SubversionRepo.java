package com.capitalone.dashboard.model;

/**
 * CollectorItem extension to store the subversion url.
 */
public class SubversionRepo extends CollectorItem {
    private static final String URL = "url";
    private static final String LATEST_REV = "rev";

    public String getUrl() {
        return (String) getOptions().get(URL);
    }

    public void setUrl(String instanceUrl) {
        getOptions().put(URL, instanceUrl);
    }

    public long getLatestRevision() {
        Object latestRev = getOptions().get(LATEST_REV);
        return latestRev == null ? 0 : (long) latestRev;
    }

    public void setLatestRev(long latestRev) {
        getOptions().put(LATEST_REV, latestRev);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
        	return true;
        }
        if (o == null || getClass() != o.getClass()) {
        	return false;
        }

        SubversionRepo subversionRepo = (SubversionRepo) o;

        return getUrl().equals(subversionRepo.getUrl());
    }

    @Override
    public int hashCode() {
        return getUrl().hashCode();
    }
}
