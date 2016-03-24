/**
 * 
 */
package com.github.resume.domain.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mustafa Dagher
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GithubRepository {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("full_name")
	private String fullName;
	@JsonProperty("owner")
	private GithubUser owner;
	@JsonProperty("private")
	private Boolean _private;
	@JsonProperty("html_url")
	private String htmlUrl;
	@JsonProperty("description")
	private String description;
	@JsonProperty("fork")
	private Boolean fork;
	@JsonProperty("url")
	private String url;
	@JsonProperty("forks_url")
	private String forksUrl;
	@JsonProperty("keys_url")
	private String keysUrl;
	@JsonProperty("collaborators_url")
	private String collaboratorsUrl;
	@JsonProperty("teams_url")
	private String teamsUrl;
	@JsonProperty("hooks_url")
	private String hooksUrl;
	@JsonProperty("issue_events_url")
	private String issueEventsUrl;
	@JsonProperty("events_url")
	private String eventsUrl;
	@JsonProperty("assignees_url")
	private String assigneesUrl;
	@JsonProperty("branches_url")
	private String branchesUrl;
	@JsonProperty("tags_url")
	private String tagsUrl;
	@JsonProperty("blobs_url")
	private String blobsUrl;
	@JsonProperty("git_tags_url")
	private String gitTagsUrl;
	@JsonProperty("git_refs_url")
	private String gitRefsUrl;
	@JsonProperty("trees_url")
	private String treesUrl;
	@JsonProperty("statuses_url")
	private String statusesUrl;
	@JsonProperty("languages_url")
	private String languagesUrl;
	@JsonProperty("stargazers_url")
	private String stargazersUrl;
	@JsonProperty("contributors_url")
	private String contributorsUrl;
	@JsonProperty("subscribers_url")
	private String subscribersUrl;
	@JsonProperty("subscription_url")
	private String subscriptionUrl;
	@JsonProperty("commits_url")
	private String commitsUrl;
	@JsonProperty("git_commits_url")
	private String gitCommitsUrl;
	@JsonProperty("comments_url")
	private String commentsUrl;
	@JsonProperty("issue_comment_url")
	private String issueCommentUrl;
	@JsonProperty("contents_url")
	private String contentsUrl;
	@JsonProperty("compare_url")
	private String compareUrl;
	@JsonProperty("merges_url")
	private String mergesUrl;
	@JsonProperty("archive_url")
	private String archiveUrl;
	@JsonProperty("downloads_url")
	private String downloadsUrl;
	@JsonProperty("issues_url")
	private String issuesUrl;
	@JsonProperty("pulls_url")
	private String pullsUrl;
	@JsonProperty("milestones_url")
	private String milestonesUrl;
	@JsonProperty("notifications_url")
	private String notificationsUrl;
	@JsonProperty("labels_url")
	private String labelsUrl;
	@JsonProperty("releases_url")
	private String releasesUrl;
	@JsonProperty("deployments_url")
	private String deploymentsUrl;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("pushed_at")
	private String pushedAt;
	@JsonProperty("git_url")
	private String gitUrl;
	@JsonProperty("ssh_url")
	private String sshUrl;
	@JsonProperty("clone_url")
	private String cloneUrl;
	@JsonProperty("svn_url")
	private String svnUrl;
	@JsonProperty("homepage")
	private String homepage;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("stargazers_count")
	private Integer stargazersCount;
	@JsonProperty("watchers_count")
	private Integer watchersCount;
	@JsonProperty("language")
	private String language;
	@JsonProperty("has_issues")
	private Boolean hasIssues;
	@JsonProperty("has_downloads")
	private Boolean hasDownloads;
	@JsonProperty("has_wiki")
	private Boolean hasWiki;
	@JsonProperty("has_pages")
	private Boolean hasPages;
	@JsonProperty("forks_count")
	private Integer forksCount;
	@JsonProperty("mirror_url")
	private String mirrorUrl;
	@JsonProperty("open_issues_count")
	private Integer openIssuesCount;
	@JsonProperty("forks")
	private Integer forks;
	@JsonProperty("open_issues")
	private Integer openIssues;
	@JsonProperty("watchers")
	private Integer watchers;
	@JsonProperty("default_branch")
	private String defaultBranch;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public GithubUser getOwner() {
		return owner;
	}

	public void setOwner(GithubUser owner) {
		this.owner = owner;
	}

	public Boolean get_private() {
		return _private;
	}

	public void set_private(Boolean _private) {
		this._private = _private;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getFork() {
		return fork;
	}

	public void setFork(Boolean fork) {
		this.fork = fork;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getForksUrl() {
		return forksUrl;
	}

	public void setForksUrl(String forksUrl) {
		this.forksUrl = forksUrl;
	}

	public String getKeysUrl() {
		return keysUrl;
	}

	public void setKeysUrl(String keysUrl) {
		this.keysUrl = keysUrl;
	}

	public String getCollaboratorsUrl() {
		return collaboratorsUrl;
	}

	public void setCollaboratorsUrl(String collaboratorsUrl) {
		this.collaboratorsUrl = collaboratorsUrl;
	}

	public String getTeamsUrl() {
		return teamsUrl;
	}

	public void setTeamsUrl(String teamsUrl) {
		this.teamsUrl = teamsUrl;
	}

	public String getHooksUrl() {
		return hooksUrl;
	}

	public void setHooksUrl(String hooksUrl) {
		this.hooksUrl = hooksUrl;
	}

	public String getIssueEventsUrl() {
		return issueEventsUrl;
	}

	public void setIssueEventsUrl(String issueEventsUrl) {
		this.issueEventsUrl = issueEventsUrl;
	}

	public String getEventsUrl() {
		return eventsUrl;
	}

	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	public String getAssigneesUrl() {
		return assigneesUrl;
	}

	public void setAssigneesUrl(String assigneesUrl) {
		this.assigneesUrl = assigneesUrl;
	}

	public String getBranchesUrl() {
		return branchesUrl;
	}

	public void setBranchesUrl(String branchesUrl) {
		this.branchesUrl = branchesUrl;
	}

	public String getTagsUrl() {
		return tagsUrl;
	}

	public void setTagsUrl(String tagsUrl) {
		this.tagsUrl = tagsUrl;
	}

	public String getBlobsUrl() {
		return blobsUrl;
	}

	public void setBlobsUrl(String blobsUrl) {
		this.blobsUrl = blobsUrl;
	}

	public String getGitTagsUrl() {
		return gitTagsUrl;
	}

	public void setGitTagsUrl(String gitTagsUrl) {
		this.gitTagsUrl = gitTagsUrl;
	}

	public String getGitRefsUrl() {
		return gitRefsUrl;
	}

	public void setGitRefsUrl(String gitRefsUrl) {
		this.gitRefsUrl = gitRefsUrl;
	}

	public String getTreesUrl() {
		return treesUrl;
	}

	public void setTreesUrl(String treesUrl) {
		this.treesUrl = treesUrl;
	}

	public String getStatusesUrl() {
		return statusesUrl;
	}

	public void setStatusesUrl(String statusesUrl) {
		this.statusesUrl = statusesUrl;
	}

	public String getLanguagesUrl() {
		return languagesUrl;
	}

	public void setLanguagesUrl(String languagesUrl) {
		this.languagesUrl = languagesUrl;
	}

	public String getStargazersUrl() {
		return stargazersUrl;
	}

	public void setStargazersUrl(String stargazersUrl) {
		this.stargazersUrl = stargazersUrl;
	}

	public String getContributorsUrl() {
		return contributorsUrl;
	}

	public void setContributorsUrl(String contributorsUrl) {
		this.contributorsUrl = contributorsUrl;
	}

	public String getSubscribersUrl() {
		return subscribersUrl;
	}

	public void setSubscribersUrl(String subscribersUrl) {
		this.subscribersUrl = subscribersUrl;
	}

	public String getSubscriptionUrl() {
		return subscriptionUrl;
	}

	public void setSubscriptionUrl(String subscriptionUrl) {
		this.subscriptionUrl = subscriptionUrl;
	}

	public String getCommitsUrl() {
		return commitsUrl;
	}

	public void setCommitsUrl(String commitsUrl) {
		this.commitsUrl = commitsUrl;
	}

	public String getGitCommitsUrl() {
		return gitCommitsUrl;
	}

	public void setGitCommitsUrl(String gitCommitsUrl) {
		this.gitCommitsUrl = gitCommitsUrl;
	}

	public String getCommentsUrl() {
		return commentsUrl;
	}

	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	public String getIssueCommentUrl() {
		return issueCommentUrl;
	}

	public void setIssueCommentUrl(String issueCommentUrl) {
		this.issueCommentUrl = issueCommentUrl;
	}

	public String getContentsUrl() {
		return contentsUrl;
	}

	public void setContentsUrl(String contentsUrl) {
		this.contentsUrl = contentsUrl;
	}

	public String getCompareUrl() {
		return compareUrl;
	}

	public void setCompareUrl(String compareUrl) {
		this.compareUrl = compareUrl;
	}

	public String getMergesUrl() {
		return mergesUrl;
	}

	public void setMergesUrl(String mergesUrl) {
		this.mergesUrl = mergesUrl;
	}

	public String getArchiveUrl() {
		return archiveUrl;
	}

	public void setArchiveUrl(String archiveUrl) {
		this.archiveUrl = archiveUrl;
	}

	public String getDownloadsUrl() {
		return downloadsUrl;
	}

	public void setDownloadsUrl(String downloadsUrl) {
		this.downloadsUrl = downloadsUrl;
	}

	public String getIssuesUrl() {
		return issuesUrl;
	}

	public void setIssuesUrl(String issuesUrl) {
		this.issuesUrl = issuesUrl;
	}

	public String getPullsUrl() {
		return pullsUrl;
	}

	public void setPullsUrl(String pullsUrl) {
		this.pullsUrl = pullsUrl;
	}

	public String getMilestonesUrl() {
		return milestonesUrl;
	}

	public void setMilestonesUrl(String milestonesUrl) {
		this.milestonesUrl = milestonesUrl;
	}

	public String getNotificationsUrl() {
		return notificationsUrl;
	}

	public void setNotificationsUrl(String notificationsUrl) {
		this.notificationsUrl = notificationsUrl;
	}

	public String getLabelsUrl() {
		return labelsUrl;
	}

	public void setLabelsUrl(String labelsUrl) {
		this.labelsUrl = labelsUrl;
	}

	public String getReleasesUrl() {
		return releasesUrl;
	}

	public void setReleasesUrl(String releasesUrl) {
		this.releasesUrl = releasesUrl;
	}

	public String getDeploymentsUrl() {
		return deploymentsUrl;
	}

	public void setDeploymentsUrl(String deploymentsUrl) {
		this.deploymentsUrl = deploymentsUrl;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getPushedAt() {
		return pushedAt;
	}

	public void setPushedAt(String pushedAt) {
		this.pushedAt = pushedAt;
	}

	public String getGitUrl() {
		return gitUrl;
	}

	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
	}

	public String getSshUrl() {
		return sshUrl;
	}

	public void setSshUrl(String sshUrl) {
		this.sshUrl = sshUrl;
	}

	public String getCloneUrl() {
		return cloneUrl;
	}

	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
	}

	public String getSvnUrl() {
		return svnUrl;
	}

	public void setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getStargazersCount() {
		return stargazersCount;
	}

	public void setStargazersCount(Integer stargazersCount) {
		this.stargazersCount = stargazersCount;
	}

	public Integer getWatchersCount() {
		return watchersCount;
	}

	public void setWatchersCount(Integer watchersCount) {
		this.watchersCount = watchersCount;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Boolean getHasIssues() {
		return hasIssues;
	}

	public void setHasIssues(Boolean hasIssues) {
		this.hasIssues = hasIssues;
	}

	public Boolean getHasDownloads() {
		return hasDownloads;
	}

	public void setHasDownloads(Boolean hasDownloads) {
		this.hasDownloads = hasDownloads;
	}

	public Boolean getHasWiki() {
		return hasWiki;
	}

	public void setHasWiki(Boolean hasWiki) {
		this.hasWiki = hasWiki;
	}

	public Boolean getHasPages() {
		return hasPages;
	}

	public void setHasPages(Boolean hasPages) {
		this.hasPages = hasPages;
	}

	public Integer getForksCount() {
		return forksCount;
	}

	public void setForksCount(Integer forksCount) {
		this.forksCount = forksCount;
	}

	public String getMirrorUrl() {
		return mirrorUrl;
	}

	public void setMirrorUrl(String mirrorUrl) {
		this.mirrorUrl = mirrorUrl;
	}

	public Integer getOpenIssuesCount() {
		return openIssuesCount;
	}

	public void setOpenIssuesCount(Integer openIssuesCount) {
		this.openIssuesCount = openIssuesCount;
	}

	public Integer getForks() {
		return forks;
	}

	public void setForks(Integer forks) {
		this.forks = forks;
	}

	public Integer getOpenIssues() {
		return openIssues;
	}

	public void setOpenIssues(Integer openIssues) {
		this.openIssues = openIssues;
	}

	public Integer getWatchers() {
		return watchers;
	}

	public void setWatchers(Integer watchers) {
		this.watchers = watchers;
	}

	public String getDefaultBranch() {
		return defaultBranch;
	}

	public void setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch;
	}

	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

}
