import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String background_image;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String email;
	public String topic;
	public String name;
	public String type;
	public String code_of_conduct;
	public String location_name;
	public String end_time;
	public String timezone;
	public String start_time;
	public int id;
	public String privacy;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String logo;

	public RootModel(String organizer_description, String background_image, String state, Call_for_papersModel call_for_papers, String description, String email, String topic, String name, String type, String code_of_conduct, String location_name, String end_time, String timezone, String start_time, int id, String privacy, CreatorModel creator, CopyrightModel copyright, String schedule_published_on, String organizer_name, ArrayList<Social_linksModel> social_links, VersionModel version, String logo) {

		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.email = email;
		this.topic = topic;
		this.name = name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.end_time = end_time;
		this.timezone = timezone;
		this.start_time = start_time;
		this.id = id;
		this.privacy = privacy;
		this._creator = creator;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._version = version;
		this.logo = logo;

	}

}