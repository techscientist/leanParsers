import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String topic;
	public String end_time;
	public String type;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public CopyrightModel _copyright;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String email;
	public CreatorModel _creator;
	public String organizer_name;
	public String name;
	public String state;
	public String description;
	public int id;
	public VersionModel _version;
	public String schedule_published_on;
	public String background_image;
	public String code_of_conduct;
	public String start_time;

	public RootModel(String timezone, String topic, String end_time, String type, String logo, ArrayList<Social_linksModel> social_links, String privacy, CopyrightModel copyright, String location_name, Call_for_papersModel call_for_papers, String organizer_description, String email, CreatorModel creator, String organizer_name, String name, String state, String description, int id, VersionModel version, String schedule_published_on, String background_image, String code_of_conduct, String start_time) {

		this.timezone = timezone;
		this.topic = topic;
		this.end_time = end_time;
		this.type = type;
		this.logo = logo;
		this.social_links = social_links;
		this.privacy = privacy;
		this._copyright = copyright;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.email = email;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.name = name;
		this.state = state;
		this.description = description;
		this.id = id;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;

	}

}