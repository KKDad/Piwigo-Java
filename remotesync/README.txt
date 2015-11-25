#-------------------------------------------------------------------------------
# Copyright (c) 2014 Matthieu Helleboid.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the GNU Public License v2.0
# which accompanies this distribution, and is available at
# http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
# 
# Contributors:
#     Matthieu Helleboid - initial API and implementation
#-------------------------------------------------------------------------------

#install tools
apt-get install git maven 

#clone remote sync
git clone https://github.com/Piwigo/Piwigo-Java.git
cd Piwigo-Java

#build remote sync without tests
cd remotesync
mvn -Dmaven.test.skip=true clean package

#show help
java -jar target/remotesync.jar -help
java -jar target/remotesync-ui.jar -help

#launch remote sync ui
java -jar target/remotesync-ui.jar
