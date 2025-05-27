def contdown(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def contbuild()
{
  sh 'mvn package'
}

