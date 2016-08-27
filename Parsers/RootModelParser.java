import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		CreatorModelParser creator_parser = new CreatorModelParser();
		VersionModelParser version_parser = new VersionModelParser();
		Social_linksModelParser social_links_parser;
		CopyrightModelParser copyright_parser = new CopyrightModelParser();
		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();

		public RootModelParser() {
			social_links_parser = new Social_linksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
					JSONArray social_links_arr = jsobj.getJSONArray("social_links");
			
					for(int i = 0 ;i<social_links_arr.length();i++){

 						social_linkss.add(social_links_parser.parseSocial_linksModel((String)social_links_arr.get(i)));

					}

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					local_model = new RootModel(jsobj.getString("logo") , jsobj.getInt("id") , jsobj.getString("timezone") , jsobj.getString("code_of_conduct") , creator, jsobj.getString("state") , version, jsobj.getString("privacy") , jsobj.getString("location_name") , jsobj.getString("start_time") , social_linkss, jsobj.getString("organizer_description") , jsobj.getString("description") , jsobj.getString("organizer_name") , jsobj.getString("type") , copyright, jsobj.getString("end_time") , jsobj.getString("topic") , jsobj.getString("background_image") , jsobj.getString("email") , call_for_papers, jsobj.getString("schedule_published_on") , jsobj.getString("name") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}