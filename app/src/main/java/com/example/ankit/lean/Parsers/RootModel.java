import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String name;
	public CreatorModel _creator;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public int id;
	public VersionModel _version;
	public String location_name;
	public String code_of_conduct;
	public String organizer_name;
	public String logo;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String timezone;
	public String type;
	public String email;
	public String description;
	public String schedule_published_on;
	public String background_image;
	public String organizer_description;
	public String start_time;

	public RootModel(String privacy, String name, CreatorModel creator, String end_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, int id, VersionModel version, String location_name, String code_of_conduct, String organizer_name, String logo, String topic, Call_for_papersModel call_for_papers, String state, String timezone, String type, String email, String description, String schedule_published_on, String background_image, String organizer_description, String start_time) {

		this.privacy = privacy;
		this.name = name;
		this._creator = creator;
		this.end_time = end_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this.id = id;
		this._version = version;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.timezone = timezone;
		this.type = type;
		this.email = email;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.start_time = start_time;

	}

}