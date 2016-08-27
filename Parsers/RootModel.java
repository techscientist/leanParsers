import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String topic;
	public String logo;
	public String type;
	public String timezone;
	public String location_name;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String name;
	public VersionModel _version;
	public String background_image;
	public String privacy;
	public String email;
	public int id;
	public String code_of_conduct;
	public String state;
	public String organizer_name;
	public String organizer_description;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String start_time;

	public RootModel(String schedule_published_on, String topic, String logo, String type, String timezone, String location_name, CopyrightModel copyright, Call_for_papersModel call_for_papers, CreatorModel creator, String name, VersionModel version, String background_image, String privacy, String email, int id, String code_of_conduct, String state, String organizer_name, String organizer_description, String description, ArrayList<Social_linksModel> social_links, String end_time, String start_time) {

		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.logo = logo;
		this.type = type;
		this.timezone = timezone;
		this.location_name = location_name;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.name = name;
		this._version = version;
		this.background_image = background_image;
		this.privacy = privacy;
		this.email = email;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.social_links = social_links;
		this.end_time = end_time;
		this.start_time = start_time;

	}

}