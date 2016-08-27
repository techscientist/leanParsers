import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String email;
	public String organizer_name;
	public String organizer_description;
	public int id;
	public String background_image;
	public String state;
	public String code_of_conduct;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String topic;
	public String start_time;
	public CopyrightModel _copyright;
	public String timezone;
	public String description;
	public String logo;
	public CreatorModel _creator;
	public String end_time;

	public RootModel(String name, String location_name, VersionModel version, ArrayList<Social_linksModel> social_links, String schedule_published_on, String email, String organizer_name, String organizer_description, int id, String background_image, String state, String code_of_conduct, String privacy, Call_for_papersModel call_for_papers, String type, String topic, String start_time, CopyrightModel copyright, String timezone, String description, String logo, CreatorModel creator, String end_time) {

		this.name = name;
		this.location_name = location_name;
		this._version = version;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.background_image = background_image;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.topic = topic;
		this.start_time = start_time;
		this._copyright = copyright;
		this.timezone = timezone;
		this.description = description;
		this.logo = logo;
		this._creator = creator;
		this.end_time = end_time;

	}

}