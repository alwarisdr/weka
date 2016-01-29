/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 *    ScatterPlotMatrix.java
 *    Copyright (C) 2015 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.knowledgeflow.steps;

import weka.gui.knowledgeflow.KFGUIConsts;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Step that collects data for display in a scatter plot matrix.
 *
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com)
 * @version $Revision: $
 */
@KFStep(name = "ScatterPlotMatrix", category = "Visualization",
  toolTipText = "Visualize datasets in a scatter plot matrix",
  iconPath = KFGUIConsts.BASE_ICON_PATH + "ScatterPlotMatrix.gif")
public class ScatterPlotMatrix extends BaseSimpleDataVisualizer {

  private static final long serialVersionUID = -2033576643553187310L;

  @Override
  public Map<String, String> getInteractiveViewers() {
    Map<String, String> views = new LinkedHashMap<String, String>();

    if (m_data.size() > 0) {
      views.put("Show plots",
        "weka.gui.knowledgeflow.steps.ScatterPlotMatrixInteractiveView");
    }

    return views;
  }
}