import java.util.ArrayList;

class RootModel {

	public String description;
	public String logo;
	public String timezone;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_description;
	public int id;
	public String start_time;
	public String privacy;
	public String type;
	public String state;
	public VersionModel _version;
	public String topic;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String background_image;
	public String location_name;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;

	public RootModel(String description, String logo, String timezone, String name, Call_for_papersModel call_for_papers, CopyrightModel copyright, CreatorModel creator, String organizer_description, int id, String start_time, String privacy, String type, String state, VersionModel version, String topic, String organizer_name, String code_of_conduct, String schedule_published_on, String background_image, String location_name, String email, ArrayList<Social_linksModel> social_links, String end_time) {

		this.description = description;
		this.logo = logo;
		this.timezone = timezone;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.id = id;
		this.start_time = start_time;
		this.privacy = privacy;
		this.type = type;
		this.state = state;
		this._version = version;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.location_name = location_name;
		this.email = email;
		this.social_links = social_links;
		this.end_time = end_time;

	}

}