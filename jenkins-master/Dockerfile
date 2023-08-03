FROM jenkins/jenkins:2.415-jdk11
ARG USR_PATH_JENKINS=/usr/share/jenkins

USER root

# Copy plugins text file and download them
COPY --chown=jenkins:jenkins plugins.txt ${USR_PATH_JENKINS}/plugins.txt
RUN jenkins-plugin-cli -f "${USR_PATH_JENKINS}/plugins.txt"

COPY --chown=jenkins:jenkins ./casc-configs/ /var/jenkins_conf

USER jenkins
