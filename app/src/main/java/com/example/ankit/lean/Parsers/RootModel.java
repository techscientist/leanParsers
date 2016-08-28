import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String schedule_published_on;
	public String code_of_conduct;
	public String name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public int id;
	public String state;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String privacy;
	public String organizer_name;
	public String topic;
	public String start_time;
	public CopyrightModel _copyright;
	public String logo;
	public String organizer_description;
	public String type;
	public CreatorModel _creator;
	public String description;
	public String end_time;

	public RootModel(String timezone, String schedule_published_on, String code_of_conduct, String name, VersionModel version, Call_for_papersModel call_for_papers, String background_image, int id, String state, String location_name, ArrayList<Social_linksModel> social_links, String email, String privacy, String organizer_name, String topic, String start_time, CopyrightModel copyright, String logo, String organizer_description, String type, CreatorModel creator, String description, String end_time) {

		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.id = id;
		this.state = state;
		this.location_name = location_name;
		this.social_links = social_links;
		this.email = email;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.start_time = start_time;
		this._copyright = copyright;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.type = type;
		this._creator = creator;
		this.description = description;
		this.end_time = end_time;

	}

}