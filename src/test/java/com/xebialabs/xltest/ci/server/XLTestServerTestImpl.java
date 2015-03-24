/**
 * Copyright (c) 2014-2015, XebiaLabs B.V., All rights reserved.
 *
 * The XL Test plugin for Jenkins is licensed under the terms of the GPLv2
 * <http://www.gnu.org/licenses/old-licenses/gpl-2.0.html>, like most XebiaLabs
 * Libraries. There are special exceptions to the terms and conditions of the
 * GPLv2 as it is applied to this software, see the FLOSS License Exception
 * <https://github.com/jenkinsci/xltest-plugin/blob/master/LICENSE>.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 */
package com.xebialabs.xltest.ci.server;

import com.xebialabs.xltest.ci.server.domain.TestTool;
import hudson.FilePath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

/**
 * This is a mock class! We need this because the combination of PowerMock and JenkinsRule is not possible.
 */
public class XLTestServerTestImpl implements XLTestServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(XLTestServerTestImpl.class);

    private String user;
    private String password;
    private String proxyUrl;
    private String serverUrl;

    XLTestServerTestImpl(String serverUrl, String proxyUrl, String username, String password) {
        this.user=username;
        this.password=password;
        this.proxyUrl=proxyUrl;
        this.serverUrl=serverUrl;
    }


    @Override
    public void checkConnection() {

    }

    @Override
    public Object getVersion() {
        return serverUrl;
    }

    @Override
    public void sendBackResults(final FilePath workspace, final String jobName, final String pattern, final Map<String, String> queryParameters, final PrintStream logger) throws IOException, InterruptedException {

    }

    @Override
    public List<TestTool> getTestTools() {
        return null;
    }

}
