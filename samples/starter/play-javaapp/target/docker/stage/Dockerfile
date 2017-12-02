FROM openjdk:latest
LABEL MAINTAINER="Jaric Sng"
WORKDIR /opt/docker
ADD --chown=daemon:daemon opt /opt
USER daemon
ENTRYPOINT ["bin/play-javaapp"]
CMD []
