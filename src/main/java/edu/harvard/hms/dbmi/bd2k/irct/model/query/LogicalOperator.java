/*
 *  This file is part of Inter-Resource Communication Tool (IRCT).
 *
 *  IRCT is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  IRCT is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with IRCT.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.harvard.hms.dbmi.bd2k.irct.model.query;

/**
 * Logical Operator enumerations provide a choice of three different operators
 * that can be used to combine different where clauses or other parts of a query
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
public enum LogicalOperator {
	AND, OR, NOT
}