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

public class TBL_CFD_REPORTE_MENSUAL 
{
	private int m_Ano;
	private byte m_Mes;
	private String m_Archivo;
	private boolean m_Cerrado;

	public void setAno(int Ano)
	{
		m_Ano = Ano;
	}

	public void setMes(byte Mes)
	{
		m_Mes = Mes;
	}

	public void setCerrado(boolean Cerrado)
	{
		m_Cerrado = Cerrado;
	}

	public int getAno()
	{
		return m_Ano;
	}

	public byte getMes()
	{
		return m_Mes;
	}

	public boolean getCerrado()
	{
		return m_Cerrado;
	}

	public void setArchivo(String Archivo) 
	{
		m_Archivo = Archivo;
	}
	
	public String getArchivo()
	{
		return m_Archivo;
	}

}