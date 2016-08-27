import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String type;
	public String start_time;
	public String organizer_name;
	public String name;
	public String description;
	public String end_time;
	public VersionModel _version;
	public String code_of_conduct;
	public String topic;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String location_name;
	public String email;
	public int id;
	public String privacy;
	public String background_image;
	public String schedule_published_on;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String logo;

	public RootModel(CopyrightModel copyright, String type, String start_time, String organizer_name, String name, String description, String end_time, VersionModel version, String code_of_conduct, String topic, String timezone, Call_for_papersModel call_for_papers, CreatorModel creator, String location_name, String email, int id, String privacy, String background_image, String schedule_published_on, String state, ArrayList<Social_linksModel> social_links, String organizer_description, String logo) {

		this._copyright = copyright;
		this.type = type;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.name = name;
		this.description = description;
		this.end_time = end_time;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.location_name = location_name;
		this.email = email;
		this.id = id;
		this.privacy = privacy;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.logo = logo;

	}

}