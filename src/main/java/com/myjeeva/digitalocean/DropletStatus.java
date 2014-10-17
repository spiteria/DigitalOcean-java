/*
 * The MIT License
 * 
 * Copyright (c) 2010-2014 Jeevanandam M. (myjeeva.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.myjeeva.digitalocean;

/**
 * Describes possible droplet states.
 * 
 * @author Robert Gründler (robert@dubture.com) - pulse00
 * 
 * @since v1.5
 */
public enum DropletStatus {

  New("new"), Active("active"), Off("off"), Archive("archive");

  private String value;

  private DropletStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value;
  }

  public static DropletStatus fromValue(String value) {
    if (null == value || "".equals(value)) {
      throw new IllegalArgumentException("Value cannot be null or empty!");

    } else if ("new".equals(value)) {
      return DropletStatus.New;
    } else if ("active".equals(value)) {
      return DropletStatus.Active;
    } else if ("off".equals(value)) {
      return DropletStatus.Off;
    } else if ("archive".equals(value)) {
      return DropletStatus.Archive;
    } else {
      throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
  }
}