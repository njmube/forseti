/*
    Forseti, El ERP Gratuito para PyMEs
    Copyright (C) 2015 Gabriel Gutiérrez Fuentes.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package forseti.sets;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import forseti.JFsiMetaDatos;
import forseti.JManejadorSet;

public class JReportesLevel2 extends JManejadorSet
{

	public JReportesLevel2(HttpServletRequest request)
	{
		m_PageSize = 50;
		this.request = request;
                m_bMD = true;
	}

	public REP_LEVEL2 getRow(int row)
	{
		return (REP_LEVEL2)m_Rows.elementAt((getFloorRow() + row));
	}

	public REP_LEVEL2 getAbsRow(int row)
	{
		return (REP_LEVEL2)m_Rows.elementAt(row);
	}

	 
  @SuppressWarnings("unchecked")
  protected void BindRow()
	{
		try
		{
                        REP_LEVEL2 pNode = new REP_LEVEL2(request);

                        for(int i = 0; i < getNumCols(); i++)
                        {
                          JFsiMetaDatos md = (JFsiMetaDatos)m_Columns.elementAt(i);
                          pNode.setSTS(md.getNombreCol(), ( (m_RS.getString(md.getNombreCol()) == null) ? "" : m_RS.getString(md.getNombreCol()) ) );

                        }

                        m_Rows.addElement(pNode);

		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new RuntimeException(e.toString());
		}

	}

}