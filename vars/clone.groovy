def call(String url, String branch){
  echo "This is cloning the code"
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo "Code cloning successful"
}
