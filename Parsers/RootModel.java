import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String organizer_description;
	public CreatorModel _creator;
	public String state;
	public String logo;
	public CopyrightModel _copyright;
	public String name;
	public String schedule_published_on;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public int id;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String code_of_conduct;
	public String email;
	public String start_time;
	public String end_time;
	public String topic;
	public String background_image;
	public VersionModel _version;
	public String description;

	public RootModel(String timezone, String organizer_description, CreatorModel creator, String state, String logo, CopyrightModel copyright, String name, String schedule_published_on, String location_name, ArrayList<Social_linksModel> social_links, String privacy, int id, String organizer_name, Call_for_papersModel call_for_papers, String type, String code_of_conduct, String email, String start_time, String end_time, String topic, String background_image, VersionModel version, String description) {

		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.state = state;
		this.logo = logo;
		this._copyright = copyright;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.id = id;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.start_time = start_time;
		this.end_time = end_time;
		this.topic = topic;
		this.background_image = background_image;
		this._version = version;
		this.description = description;

	}

}