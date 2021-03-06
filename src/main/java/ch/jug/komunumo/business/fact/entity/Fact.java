/*
 * Komunumo – Open Source Community Manager
 * Copyright (C) 2017 Java User Group Switzerland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package ch.jug.komunumo.business.fact.entity;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Value
@Builder(toBuilder = true)
public class Fact implements Serializable {

    private static final long serialVersionUID = 1L;

    String id;
    Long version;

    @NotNull Long value;
    @NotNull String description;

}
