import java.util.ArrayList;

class RootModel {

	public String description;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String start_time;
	public String privacy;
	public CreatorModel _creator;
	public String name;
	public VersionModel _version;
	public String type;
	public String code_of_conduct;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String schedule_published_on;
	public int id;
	public String organizer_description;
	public String state;
	public String logo;
	public String topic;
	public String timezone;
	public String email;
	public String end_time;

	public RootModel(String description, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String organizer_name, String start_time, String privacy, CreatorModel creator, String name, VersionModel version, String type, String code_of_conduct, String background_image, Call_for_papersModel call_for_papers, String location_name, String schedule_published_on, int id, String organizer_description, String state, String logo, String topic, String timezone, String email, String end_time) {

		this.description = description;
		this._copyright = copyright;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.privacy = privacy;
		this._creator = creator;
		this.name = name;
		this._version = version;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.organizer_description = organizer_description;
		this.state = state;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this.email = email;
		this.end_time = end_time;

	}

}