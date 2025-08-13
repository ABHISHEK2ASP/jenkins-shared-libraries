def call(String docker_username, String github_repo){
    sh "docker build -t ${docker_username}/${github_repo}"
}
