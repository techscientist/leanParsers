import java.util.ArrayList;

class RootModel {

	public String topic;
	public String logo;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_description;
	public String privacy;
	public int id;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String background_image;
	public String state;
	public String name;
	public String start_time;
	public String code_of_conduct;
	public String timezone;
	public String description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String location_name;
	public String end_time;

	public RootModel(String topic, String logo, VersionModel version, Call_for_papersModel call_for_papers, String email, String organizer_description, String privacy, int id, String type, ArrayList<Social_linksModel> social_links, String organizer_name, String background_image, String state, String name, String start_time, String code_of_conduct, String timezone, String description, CopyrightModel copyright, String schedule_published_on, CreatorModel creator, String location_name, String end_time) {

		this.topic = topic;
		this.logo = logo;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.id = id;
		this.type = type;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.state = state;
		this.name = name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.description = description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.location_name = location_name;
		this.end_time = end_time;

	}

}