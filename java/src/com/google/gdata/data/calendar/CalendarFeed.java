/* Copyright (c) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.gdata.data.calendar;

import com.google.gdata.data.BaseFeed;
import com.google.gdata.data.Link;

/**
 * Describes a feed of Calendars.
 *
 * 
 */
public class CalendarFeed extends BaseFeed<CalendarFeed, CalendarEntry> {

  /**
   * Default mutable constructor.
   */
  public CalendarFeed() {
    super(CalendarEntry.class);
  }

  /**
   * Constructs a new instance by doing a shallow copy of data from an existing
   * {@link BaseFeed} instance.
   *
   * @param sourceFeed source feed
   */
  public CalendarFeed(BaseFeed<?, ?> sourceFeed) {
    super(CalendarEntry.class, sourceFeed);
  }

  /**
   * Returns the link that provides the URI of the full feed (without any query
   * parameters).
   *
   * @return Link that provides the URI of the full feed (without any query
   *     parameters) or {@code null} for none.
   */
  public Link getFeedLink() {
    return getLink(Link.Rel.FEED, Link.Type.ATOM);
  }

  @Override
  public String toString() {
    return "{CalendarFeed " + super.toString() + "}";
  }

}
