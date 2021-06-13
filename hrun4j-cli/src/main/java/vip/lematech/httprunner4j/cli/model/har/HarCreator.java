/**
 * har - HAR file reader, writer and viewer
 * Copyright (c) 2014-2016, Sandeep Gupta
 * <p>
 * http://sangupta.com/projects/har
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vip.lematech.httprunner4j.cli.model.har;

import lombok.Data;

/**
 * @author sangupta/lematech@foxmail.com
 * @version 1.0.0
 * @className HarCreator
 * @description HAR file creator and version information
 * @created 2021/5/2 8:35 下午
 * @publicWechat lematech
 */

@Data
public class HarCreator {

    private String name;

    private String version;

    private String comment;

    @Override
    public String toString() {
        return "[HARCreator: " + this.name + " (" + this.version + ") ]";
    }

}