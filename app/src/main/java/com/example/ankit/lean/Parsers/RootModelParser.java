import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		Social_linksModelParser social_links_parser;
		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
		CreatorModelParser creator_parser = new CreatorModelParser();
		VersionModelParser version_parser = new VersionModelParser();
		CopyrightModelParser copyright_parser = new CopyrightModelParser();

		public RootModelParser() {
			social_links_parser = new Social_linksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
					JSONArray social_links_arr = jsobj.getJSONArray("social_links");
			
					for(int i = 0 ;i<social_links_arr.length();i++){

 						social_linkss.add(social_links_parser.parseSocial_linksModel((String)social_links_arr.get(i)));

					}

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					local_model = new RootModel(jsobj.getString("start_time") , jsobj.getString("name") , social_linkss, jsobj.getString("topic") , jsobj.getString("email") , call_for_papers, jsobj.getString("background_image") , creator, version, jsobj.getString("type") , jsobj.getString("logo") , jsobj.getString("timezone") , jsobj.getString("privacy") , jsobj.getString("description") , jsobj.getString("end_time") , jsobj.getString("organizer_description") , jsobj.getString("schedule_published_on") , jsobj.getString("state") , jsobj.getString("code_of_conduct") , jsobj.getString("organizer_name") , copyright, jsobj.getInt("id") , jsobj.getString("location_name") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}