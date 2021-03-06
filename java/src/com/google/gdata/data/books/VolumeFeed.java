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


package com.google.gdata.data.books;

import com.google.gdata.data.BaseFeed;
import com.google.gdata.data.Kind;
import com.google.gdata.data.Link;

/**
 * Describes a Book Search volume feed.
 *
 * 
 */
@Kind.Term(VolumeEntry.KIND)
public class VolumeFeed extends BaseFeed<VolumeFeed, VolumeEntry> {

  /**
   * Default mutable constructor.
   */
  public VolumeFeed() {
    super(VolumeEntry.class);
    getCategories().add(VolumeEntry.CATEGORY);
  }

  /**
   * Constructs a new instance by doing a shallow copy of data from an existing
   * {@link BaseFeed} instance.
   *
   * @param sourceFeed source feed
   */
  public VolumeFeed(BaseFeed<?, ?> sourceFeed) {
    super(VolumeEntry.class, sourceFeed);
  }

  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   *
   * @return Link that provides the URI of an alternate format of the entry's or
   *     feed's contents or {@code null} for none.
   */
  public Link getAtomAlternateLink() {
    return getLink(Link.Rel.ALTERNATE, Link.Type.ATOM);
  }

  @Override
  public String toString() {
    return "{VolumeFeed " + super.toString() + "}";
  }

}
