/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.device.mgt.common.geo.service;

import org.wso2.carbon.device.mgt.common.DeviceIdentifier;

import java.util.List;

/**
 * This represents the Geo service functionality which should be implemented by
 * required GeoServiceManagers.
 */
public interface GeoLocationProviderService {

    List<GeoFence> getWithinAlerts(DeviceIdentifier identifier, String owner) throws GeoLocationBasedServiceException;

    List<GeoFence> getWithinAlerts() throws GeoLocationBasedServiceException;

    List<GeoFence> getExitAlerts(DeviceIdentifier identifier, String owner) throws GeoLocationBasedServiceException;

    List<GeoFence> getExitAlerts() throws GeoLocationBasedServiceException;

    boolean createGeoAlert(Alert alert, DeviceIdentifier identifier, String alertType, String owner)
            throws GeoLocationBasedServiceException, AlertAlreadyExistException;

    boolean createGeoAlert(Alert alert, String alertType)
            throws GeoLocationBasedServiceException,AlertAlreadyExistException;

    boolean updateGeoAlert(Alert alert, DeviceIdentifier identifier, String alertType, String owner)
            throws GeoLocationBasedServiceException, AlertAlreadyExistException;

    boolean updateGeoAlert(Alert alert, String alertType)
            throws GeoLocationBasedServiceException,AlertAlreadyExistException;

    boolean removeGeoAlert(String alertType, DeviceIdentifier identifier, String queryName, String owner)
            throws GeoLocationBasedServiceException;

    boolean removeGeoAlert(String alertType, String queryName)
            throws GeoLocationBasedServiceException;

    String getSpeedAlerts(DeviceIdentifier identifier, String owner) throws GeoLocationBasedServiceException;

    String getSpeedAlerts() throws GeoLocationBasedServiceException;

    String getProximityAlerts(DeviceIdentifier identifier, String owner) throws GeoLocationBasedServiceException;

    String getProximityAlerts() throws GeoLocationBasedServiceException;

    List<GeoFence> getStationaryAlerts(DeviceIdentifier identifier, String owner) throws GeoLocationBasedServiceException;

    List<GeoFence> getStationaryAlerts() throws GeoLocationBasedServiceException;

    List<GeoFence> getTrafficAlerts(DeviceIdentifier identifier, String owner) throws GeoLocationBasedServiceException;

    List<GeoFence> getTrafficAlerts() throws GeoLocationBasedServiceException;
}
