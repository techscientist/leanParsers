import java.util.ArrayList;

class RootModel {

	public int id;
	public String organizer_description;
	public String location_name;
	public String state;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String topic;
	public String timezone;
	public String end_time;
	public String type;
	public String name;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public VersionModel _version;
	public CreatorModel _creator;
	public String background_image;
	public String privacy;
	public String logo;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String email;

	public RootModel(int id, String organizer_description, String location_name, String state, String code_of_conduct, CopyrightModel copyright, String topic, String timezone, String end_time, String type, String name, String organizer_name, Call_for_papersModel call_for_papers, String description, VersionModel version, CreatorModel creator, String background_image, String privacy, String logo, String start_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String email) {

		this.id = id;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.topic = topic;
		this.timezone = timezone;
		this.end_time = end_time;
		this.type = type;
		this.name = name;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._version = version;
		this._creator = creator;
		this.background_image = background_image;
		this.privacy = privacy;
		this.logo = logo;
		this.start_time = start_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.email = email;

	}

}