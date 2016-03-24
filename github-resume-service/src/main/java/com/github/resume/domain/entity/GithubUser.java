package com.github.resume.domain.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mustafa Dagher
 *
 */
public class GithubUser {

	@JsonProperty("login")
	private String login;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("avatar_url")
	private String avatarUrl;
	@JsonProperty("gravatar_id")
	private String gravatarId;
	@JsonProperty("url")
	private String url;
	@JsonProperty("html_url")
	private String htmlUrl;
	@JsonProperty("followers_url")
	private String followersUrl;
	@JsonProperty("following_url")
	private String followingUrl;
	@JsonProperty("gists_url")
	private String gistsUrl;
	@JsonProperty("starred_url")
	private String starredUrl;
	@JsonProperty("subscriptions_url")
	private String subscriptionsUrl;
	@JsonProperty("organizations_url")
	private String organizationsUrl;
	@JsonProperty("repos_url")
	private String reposUrl;
	@JsonProperty("events_url")
	private String eventsUrl;
	@JsonProperty("received_events_url")
	private String receivedEventsUrl;
	@JsonProperty("type")
	private String type;
	@JsonProperty("site_admin")
	private Boolean siteAdmin;
	@JsonProperty("name")
	private String name;
	@JsonProperty("company")
	private String company;
	@JsonProperty("blog")
	private String blog;
	@JsonProperty("location")
	private String location;
	@JsonProperty("email")
	private String email;
	@JsonProperty("hireable")
	private Boolean hireable;
	@JsonProperty("bio")
	private String bio;
	@JsonProperty("public_repos")
	private Integer publicRepos;
	@JsonProperty("public_gists")
	private Integer publicGists;
	@JsonProperty("followers")
	private Integer followers;
	@JsonProperty("following")
	private Integer following;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonIgnore
	private GithubRepository[] repos = null;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getGravatarId() {
		return gravatarId;
	}

	public void setGravatarId(String gravatarId) {
		this.gravatarId = gravatarId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public String getFollowersUrl() {
		return followersUrl;
	}

	public void setFollowersUrl(String followersUrl) {
		this.followersUrl = followersUrl;
	}

	public String getFollowingUrl() {
		return followingUrl;
	}

	public void setFollowingUrl(String followingUrl) {
		this.followingUrl = followingUrl;
	}

	public String getGistsUrl() {
		return gistsUrl;
	}

	public void setGistsUrl(String gistsUrl) {
		this.gistsUrl = gistsUrl;
	}

	public String getStarredUrl() {
		return starredUrl;
	}

	public void setStarredUrl(String starredUrl) {
		this.starredUrl = starredUrl;
	}

	public String getSubscriptionsUrl() {
		return subscriptionsUrl;
	}

	public void setSubscriptionsUrl(String subscriptionsUrl) {
		this.subscriptionsUrl = subscriptionsUrl;
	}

	public String getOrganizationsUrl() {
		return organizationsUrl;
	}

	public void setOrganizationsUrl(String organizationsUrl) {
		this.organizationsUrl = organizationsUrl;
	}

	public String getReposUrl() {
		return reposUrl;
	}

	public void setReposUrl(String reposUrl) {
		this.reposUrl = reposUrl;
	}

	public String getEventsUrl() {
		return eventsUrl;
	}

	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	public String getReceivedEventsUrl() {
		return receivedEventsUrl;
	}

	public void setReceivedEventsUrl(String receivedEventsUrl) {
		this.receivedEventsUrl = receivedEventsUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getSiteAdmin() {
		return siteAdmin;
	}

	public void setSiteAdmin(Boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getHireable() {
		return hireable;
	}

	public void setHireable(Boolean hireable) {
		this.hireable = hireable;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Integer getPublicRepos() {
		return publicRepos;
	}

	public void setPublicRepos(Integer publicRepos) {
		this.publicRepos = publicRepos;
	}

	public Integer getPublicGists() {
		return publicGists;
	}

	public void setPublicGists(Integer publicGists) {
		this.publicGists = publicGists;
	}

	public Integer getFollowers() {
		return followers;
	}

	public void setFollowers(Integer followers) {
		this.followers = followers;
	}

	public Integer getFollowing() {
		return following;
	}

	public void setFollowing(Integer following) {
		this.following = following;
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

	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	public GithubRepository[] getRepos() {
		return repos;
	}

	public void setRepos(GithubRepository[] repos) {
		this.repos = repos;
	}

}
