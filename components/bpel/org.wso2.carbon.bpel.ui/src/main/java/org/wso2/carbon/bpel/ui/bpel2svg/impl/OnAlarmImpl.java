/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.bpel.ui.bpel2svg.impl;

import org.apache.axiom.om.OMElement;
import org.wso2.carbon.bpel.ui.bpel2svg.ActivityInterface;
import org.wso2.carbon.bpel.ui.bpel2svg.BPEL2SVGFactory;
import org.wso2.carbon.bpel.ui.bpel2svg.OnAlarmInterface;

/**
 * OnAlarm tag UI implementation
 */
public class OnAlarmImpl extends OnMessageImpl implements OnAlarmInterface {

    /**
     * Initializes a new instance of the OnAlarmImpl class using the specified string i.e. the token
     *
     * @param token
     */
    public OnAlarmImpl(String token) {
        super(token);
        //Assigns the name of the activity to be displayed when drawing the process
        name = "OnAlarm";
        displayName = "onAlarm";

        // Set Start and End Icons and their Sizes
        startIconPath = BPEL2SVGFactory.getInstance().getIconPath(this.getClass().getName());
        endIconPath = BPEL2SVGFactory.getInstance().getEndIconPath(this.getClass().getName());
    }

    /**
     * Initializes a new instance of the OnAlarmImpl class using the specified omElement
     *
     * @param omElement which matches the OnAlarm tag
     */
    public OnAlarmImpl(OMElement omElement) {
        super(omElement);
        //Assigns the name of the activity to be displayed when drawing the process
        name = "OnAlarm";
        displayName = "onAlarm";

        // Set Start and End Icons and their Sizes
        startIconPath = BPEL2SVGFactory.getInstance().getIconPath(this.getClass().getName());
        endIconPath = BPEL2SVGFactory.getInstance().getEndIconPath(this.getClass().getName());
    }

    /**
     * Initializes a new instance of the OnAlarmImpl class using the specified omElement
     * Constructor that is invoked when the omElement type matches an OnAlarm Activity when processing the subActivities
     * of the process
     *
     * @param omElement which matches the OnAlarm tag
     * @param parent
     */
    public OnAlarmImpl(OMElement omElement, ActivityInterface parent) {
        super(omElement);
        setParent(parent);

        //Assigns the name of the activity to be displayed when drawing the process
        name = "OnAlarm";
        displayName = "onAlarm";

        // Set Start and End Icons and their Sizes
        startIconPath = BPEL2SVGFactory.getInstance().getIconPath(this.getClass().getName());
        endIconPath = BPEL2SVGFactory.getInstance().getEndIconPath(this.getClass().getName());
    }

    /**
     * @return String with the end tag of OnAlarm Activity
     */
    @Override
    public String getEndTag() {
        return BPEL2SVGFactory.ONALARM_END_TAG;
    }

}
