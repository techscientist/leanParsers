import java.util.ArrayList;

class RootModel {

	public String logo;
	public String email;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String timezone;
	public int id;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String end_time;
	public CreatorModel _creator;
	public String organizer_name;
	public String state;
	public String description;
	public String topic;
	public String start_time;
	public String name;
	public String background_image;
	public String location_name;
	public String privacy;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;

	public RootModel(String logo, String email, String code_of_conduct, Call_for_papersModel call_for_papers, String schedule_published_on, String timezone, int id, CopyrightModel copyright, VersionModel version, String end_time, CreatorModel creator, String organizer_name, String state, String description, String topic, String start_time, String name, String background_image, String location_name, String privacy, String type, ArrayList<Social_linksModel> social_links, String organizer_description) {

		this.logo = logo;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.id = id;
		this._copyright = copyright;
		this._version = version;
		this.end_time = end_time;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.state = state;
		this.description = description;
		this.topic = topic;
		this.start_time = start_time;
		this.name = name;
		this.background_image = background_image;
		this.location_name = location_name;
		this.privacy = privacy;
		this.type = type;
		this.social_links = social_links;
		this.organizer_description = organizer_description;

	}

}