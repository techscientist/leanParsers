import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String privacy;
	public String email;
	public String type;
	public String description;
	public String topic;
	public String organizer_description;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String background_image;
	public String state;
	public String organizer_name;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String name;
	public CopyrightModel _copyright;
	public String location_name;
	public String logo;
	public String timezone;

	public RootModel(VersionModel version, String privacy, String email, String type, String description, String topic, String organizer_description, String schedule_published_on, CreatorModel creator, String background_image, String state, String organizer_name, String code_of_conduct, ArrayList<Social_linksModel> social_links, int id, String end_time, Call_for_papersModel call_for_papers, String start_time, String name, CopyrightModel copyright, String location_name, String logo, String timezone) {

		this._version = version;
		this.privacy = privacy;
		this.email = email;
		this.type = type;
		this.description = description;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.background_image = background_image;
		this.state = state;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.id = id;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.name = name;
		this._copyright = copyright;
		this.location_name = location_name;
		this.logo = logo;
		this.timezone = timezone;

	}

}