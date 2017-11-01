FROM ubuntu:14.04
RUN apt-get update
RUN apt-get install libgtk2.0-0 -y
RUN apt-get install default-jre -y
RUN apt-get install unzip -y
RUN apt-get install wget -y
RUN wget http://sead1.open.ac.uk/openpf/pf-linux.gtk.x86_64.zip
RUN unzip pf-linux.gtk.x86_64.zip && rm -f pf-linux.gtk.x86_64.zip
RUN adduser normaluser && echo "normaluser:normaluser" | chpasswd
RUN chown -R normaluser.normaluser /home/normaluser /pf
RUN chmod +x /pf/eclipse
USER normaluser
WORKDIR /home/normaluser
CMD ["/pf/eclipse"]

