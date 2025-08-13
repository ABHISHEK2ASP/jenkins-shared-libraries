def call(String username, String password, String branch, String repo){
    git url: "https://${username}:${password}@github.com/${username}/${repo}.git", branch: "${branch}"
}
