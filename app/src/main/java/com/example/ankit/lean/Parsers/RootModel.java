import java.util.ArrayList;

class RootModel {

	public String topic;
	public String organizer_name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String background_image;
	public String name;
	public CreatorModel _creator;
	public String email;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String type;
	public String organizer_description;
	public String start_time;
	public String privacy;
	public String location_name;
	public String description;
	public String logo;
	public int id;
	public String schedule_published_on;
	public String end_time;

	public RootModel(String topic, String organizer_name, CopyrightModel copyright, VersionModel version, String background_image, String name, CreatorModel creator, String email, String code_of_conduct, ArrayList<Social_linksModel> social_links, String state, Call_for_papersModel call_for_papers, String timezone, String type, String organizer_description, String start_time, String privacy, String location_name, String description, String logo, int id, String schedule_published_on, String end_time) {

		this.topic = topic;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this._version = version;
		this.background_image = background_image;
		this.name = name;
		this._creator = creator;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.type = type;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.privacy = privacy;
		this.location_name = location_name;
		this.description = description;
		this.logo = logo;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;

	}

}