/**
 * 
 */
package br.com.ilegra.testeSelecao.parse;

import org.springframework.stereotype.Component;

import br.com.ilegra.testeSelecao.config.PositionFileConfig;
import br.com.ilegra.testeSelecao.domain.Line;
import br.com.ilegra.testeSelecao.domain.LineBuyerFactory;

/**
 * @author tiago marzari
 *
 */

@Component
public class LineParseBuyer implements LineParse {

	@Override
	public Line parse(String[] data) {
		String cnpj = data[PositionFileConfig.PLACE_BUYER_CNPJ];
		String name = data[PositionFileConfig.PLACE_BUYER_NAME];
		String businessArea = data[PositionFileConfig.PLACE_BUYER_BUSINESS_AREA];
		
		return new LineBuyerFactory(cnpj, name, businessArea);
		
	}

}
