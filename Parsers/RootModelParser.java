import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
		VefdgsionModelParser vefdgsion_parser = new VefdgsionModelParser();
		CreatorModelParser creator_parser = new CreatorModelParser();
		CopyrightModelParser copyright_parser = new CopyrightModelParser();
		Socfgial_linksModelParser socfgial_links_parser;

		public RootModelParser() {
			socfgial_links_parser = new Socfgial_linksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					VefdgsionModel vefdgsion = vefdgsion_parser.parseVefdgsionModel(jsobj.getJSONObject("vefdgsion").toString());

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					ArrayList<Socfgial_linksModel> socfgial_linkss = new ArrayList<>();
					JSONArray socfgial_links_arr = jsobj.getJSONArray("socfgial_links");
			
					for(int i = 0 ;i<socfgial_links_arr.length();i++){

 						socfgial_linkss.add(socfgial_links_parser.parseSocfgial_linksModel((String)socfgial_links_arr.get(i)));

					}

					local_model = new RootModel(jsobj.getString("ofdgrganizer_name") , call_for_papers, jsobj.getString("prfdgivacy") , jsobj.getString("code_of_conduct") , jsobj.getString("tdfgpic") , jsobj.getString("tfdgye") , vefdgsion, creator, jsobj.getString("starfgttime") , jsobj.getString("timefdgzoe") , jsobj.getString("end_time") , jsobj.getString("background_image") , copyright, jsobj.getString("email") , jsobj.getString("name") , jsobj.getString("description") , jsobj.getString("logo") , jsobj.getString("scfdghedule_published_on") , socfgial_linkss, jsobj.getInt("id") , jsobj.getString("stat") , jsobj.getString("organizer_description") , jsobj.getString("lofdgcation_name") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}