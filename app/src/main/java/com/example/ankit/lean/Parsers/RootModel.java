import java.util.ArrayList;

class RootModel {

	public String email;
	public CreatorModel _creator;
	public String end_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public String organizer_description;
	public String background_image;
	public String start_time;
	public String logo;
	public String timezone;
	public String name;
	public VersionModel _version;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String topic;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String type;
	public String privacy;
	public CopyrightModel _copyright;
	public String description;

	public RootModel(String email, CreatorModel creator, String end_time, String schedule_published_on, String code_of_conduct, String organizer_description, String background_image, String start_time, String logo, String timezone, String name, VersionModel version, int id, ArrayList<Social_linksModel> social_links, String state, String topic, String location_name, Call_for_papersModel call_for_papers, String organizer_name, String type, String privacy, CopyrightModel copyright, String description) {

		this.email = email;
		this._creator = creator;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.start_time = start_time;
		this.logo = logo;
		this.timezone = timezone;
		this.name = name;
		this._version = version;
		this.id = id;
		this.social_links = social_links;
		this.state = state;
		this.topic = topic;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.type = type;
		this.privacy = privacy;
		this._copyright = copyright;
		this.description = description;

	}

}