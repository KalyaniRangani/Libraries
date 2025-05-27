def contdown(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def contbuild()
{
  sh 'mvn package'
}
def contdeploy(jobname,ipadd,contextpath)
{
  sh 'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipadd}:/var/lib/tomcat10/webapps/${contextpath}.war'
}
